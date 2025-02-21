import java.io.*;

public class ImageByteArrayConversion {
    public static void main(String[] args) {
        String sourceImagePath = "flower.jpeg"; 
        String destinationImagePath = "copied_image.jpeg"; 

        try {
            // Convert image to byte array
            byte[] imageBytes = convertImageToByteArray(sourceImagePath);
            
            // Write byte array to a new image file
            writeByteArrayToImage(imageBytes, destinationImagePath);
            
            // Verify if the original and copied images are identical
            if (verifyImagesAreIdentical(sourceImagePath, destinationImagePath)) {
                System.out.println("The new image is identical to the original.");
            } else {
                System.out.println("The new image is not identical to the original.");
            }
        } catch (IOException e) {
            System.out.println("Error during image processing: " + e.getMessage());
        }
    }

    // Convert image to byte array
    public static byte[] convertImageToByteArray(String imagePath) throws IOException {
        try (FileInputStream fis = new FileInputStream(imagePath); 
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            
            byte[] buffer = new byte[1024];
            int bytesRead;
            
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            
            return baos.toByteArray(); // Return the byte array
        }
    }

    // Write byte array back to an image file
    public static void writeByteArrayToImage(byte[] imageBytes, String destinationPath) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(destinationPath);
             ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes)) {
            
            byte[] buffer = new byte[1024];
            int bytesRead;
            
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

    // Verify if the original image and copied image are identical
    public static boolean verifyImagesAreIdentical(String sourcePath, String destinationPath) throws IOException {
        try (FileInputStream fis1 = new FileInputStream(sourcePath);
             FileInputStream fis2 = new FileInputStream(destinationPath)) {
            
            int byte1, byte2;
            while ((byte1 = fis1.read()) != -1) {
                byte2 = fis2.read();
                if (byte2 == -1 || byte1 != byte2) {
                    return false; // Images are not identical
                }
            }
            
            // Check if the second stream also reaches the end
            return fis2.read() == -1;
        }
    }
}
