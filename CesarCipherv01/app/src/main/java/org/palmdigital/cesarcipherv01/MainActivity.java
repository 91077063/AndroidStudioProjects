//public class cesarcipherv01
pack
{
    public static void main(String[] args)
    {
        String myInput = "dogs are great";
        String result = encrypt(myInput, 27);
        System.out.println("the unencrypted string is " + myInput);
        System.out.println("The encrypted string is " + result);
    } // end of main
    public static String encrypt(String input, int shift)
    {
        int size = 26;
        char[] alphabet = new char[size];
        alphabet[0] = 'A';
        alphabet[1] = 'B';
        alphabet[2] = 'C';
        alphabet[3] = 'D';
        alphabet[4] = 'E';
        alphabet[5] = 'F';
        alphabet[6] = 'G';
        alphabet[7] = 'H';
        alphabet[8] = 'I';
        alphabet[9] = 'J';
        alphabet[10] = 'K';
        alphabet[11] = 'L';
        alphabet[12] = 'M';
        alphabet[13] = 'N';
        alphabet[14] = 'O';
        alphabet[15] = 'P';
        alphabet[16] = 'Q';
        alphabet[17] = 'R';
        alphabet[18] = 'S';
        alphabet[19] = 'T';
        alphabet[20] = 'U';
        alphabet[21] = 'V';
        alphabet[22] = 'W';
        alphabet[23] = 'X';
        alphabet[24] = 'Y';
        alphabet[25] = 'Z';
        //int shift = 1;
        int shiftCharIndex;
        int fixedCharIndex;
        String output = "";
        String toUpperCase = input.toUpperCase();
        for (int i = 0; i < input.length(); i++)
        {
            for (int j = 0; j < alphabet.length; j++)
            {
                if (toUpperCase.charAt(i) == alphabet[j])
                {
                    shiftCharIndex = j + shift;
                    fixedCharIndex = shiftCharIndex % 26; // now this can only be  0 through 25
                    output = output + alphabet[fixedCharIndex];
                } // end of if statement
            } // end of inner loop
            if (input.charAt(i) == ' ')
            {
                output += " ";
            }
        } // end of outer for loop
        return output;
    }
} // end of class
