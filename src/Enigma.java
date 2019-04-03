

public class Enigma {
    public static void main(String[] args) {
        for(int i=0; i < args.length; i++){
            System.out.print(args[i]);
        }
        if(args.length > 0){
            if(args.length > 2){
                // there we can add another ciphers
                if(args[0].equals("Rot13") && (args[1].equals("-d") || args[1].equals("-e"))) {
                    Rot13 decrypt = new Rot13();
                    decrypt.decrypt(args);
                } //else if here
                else if(args[0].equals("caesar")) {
                    caesarCipher cipher = new caesarCipher();
                    System.out.println(cipher.encrypt(args));
                }
                else if(args[0].equals("vigenere")) {
                    vigenereCipher cipher = new vigenereCipher();
                    System.out.println(cipher.encrypt(args));
                }
                else {
                    System.out.println("No cipher in database!");
                }
            } else {
                System.out.println("Enter text to encypt or decrypt!");
            }      
        } else {
            System.out.println("Enter a cipher name!");
            System.out.println("Type -l to show available ciphers!");
        }
      
    }

}