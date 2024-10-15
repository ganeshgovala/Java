class Demo {
    public static void main(String args[]) {
        StringBuffer strBuffer = new StringBuffer("Hello World");
        System.out.println("Original : "+ strBuffer);
        strBuffer.deleteCharAt(6);
        System.out.println("After removing the letter at index 6 : " + strBuffer);
        strBuffer.delete(6, 10);
        System.out.println("After removing the letters from index 6 to 10 : "+strBuffer);
        strBuffer.delete(0, strBuffer.length());
        System.out.println("After removing all the letters : " + strBuffer);
    }
}

output : 
Original : Hello World
After removing the letter at index 6 : Hello orld
After removing the letters from index 6 to 10 : Hello 
After removing all the letters :
