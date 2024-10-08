package DataTypes;

public class Question18 {
	public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // Append text to the StringBuffer
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert text at a specified position
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // Replace part of the text
        sb.replace(6, 10, "Beautiful");
        System.out.println("After replace: " + sb);

        // Delete part of the text
        sb.delete(6, 16);
        System.out.println("After delete: " + sb);
	}

}
