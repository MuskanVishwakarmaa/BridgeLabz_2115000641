class BufferAndBuilder{
	
	//Main method
    public static void main(String[] args){
        int iterations = 1000000;
        String text = "hello";

        //Measuring time
        long startTimeBuffer = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++){
            sbf.append(text);
        }
        long endTimeBuffer = System.nanoTime();
        long durationBuffer = (endTimeBuffer - startTimeBuffer)/1000000;

        // Measuring time
        long startTimeBuilder = System.nanoTime();
        StringBuilder sbd = new StringBuilder();
        for (int i=0; i<iterations; i++){
            sbd.append(text);
        }
        long endTimeBuilder = System.nanoTime();
        long durationBuilder = (endTimeBuilder - startTimeBuilder)/1000000;

        // Output results
        System.out.println("Time taken by StringBuffer: " + durationBuffer + " ms");
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " ms");
    }
}
