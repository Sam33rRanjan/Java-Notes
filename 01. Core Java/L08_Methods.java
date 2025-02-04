class L08_Methods {
    static String getpen(int x)
    {
        if(x>=5)
        {
            return "Pen";
        }
        return "No Pen";
    }
    
    public static void main(String[] args) {
        // Method is a block of code that performs a specific task.
        // Method is used to perform certain actions, and they are also known as functions.
        // Method is used to define the behavior of an object.
        // Method is a collection of statements that are grouped together to perform an operation

        String str1 = getpen(10);
        System.out.println(str1); // Pen
        String str2 = getpen(3);
        System.out.println(str2); // No Pen
    }

}