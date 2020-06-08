class Main {
  
  public static void main(String[] args) {
    String a = "Putangina x";
    String b = " mo";
    String message = "Hello, bro!";

    System.out.println(a.concat(b));
    
    System.out.println(a.replace('P','M'));

    System.out.println(a.toUpperCase());

    System.out.println(a.toLowerCase());

    System.out.println(a.trim()); //removes whitespaces
    
    System.out.println(message.length()); //gets the total number of characters of the string
    
    System.out.println(message.substring(0, 2)); //The require param of the substring is the beginning index, the second param is for the end index and is optional
    
    System.out.println(message.equals("hello")); //Don't use the == operator when comparing Strings
    
    System.out.println(message.charAt(0)); //gets the element using the index position in the parameter
    
    System.out.println(message.indexOf("bro", 0)); //the counter starts from the beginning of the String
    
    System.out.println(message.lastIndexOf("bro")); //the counter starts at the end of the String
  }
  
}

//read more here: https://docs.oracle.com/javase/8/docs/api/?java/lang/String.html
