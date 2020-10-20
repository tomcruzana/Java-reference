/*
• StringBuilder()
constructs an empty string builder.
• int length()
returns the number of code units of the builder or buffer.
• StringBuilder append(String str)
appends a string and returns this.
• StringBuilder append(char c)
appends a code unit and returns this.
• StringBuilder appendCodePoint(int cp)
appends a code point, converting it into one or two code units, and returns this.
• void setCharAt(int i, char c)
sets the ith code unit to c.
• StringBuilder insert(int offset, String str)
inserts a string at position offset and returns this.
• StringBuilder insert(int offset, char c)
inserts a code unit at position offset and returns this.
• StringBuilder delete(int startIndex, int endIndex)
deletes the code units with offsets startIndex to endIndex - 1 and returns this.
• String toString()
returns a string with the same data as the builder or buffer contents.
*/
package com.company;

class Main{
    public static void main(String[] args) {
        myString ms = new myString();
        ms.createStr();
        System.out.println(ms.getSb());
    }
}

class myString{
    StringBuilder sb = new StringBuilder();

    public void createStr(){
        sb.append("hello"); //appends string
        sb.append(' '); //appends char
        sb.append("world");
        sb.appendCodePoint(64); //int code point
        sb.setCharAt(5, '_'); //replaces the char at index 5
        String completed = sb.toString();
        System.out.println(completed);
    }

    public int getSb() {
        return sb.length();
    }
}


