class Gadget {
    EncryptedEmail encryptedEmail = new EncryptedEmail();
    void decryptSender(){
        int x = encryptedEmail.getNumberOfLines();
        int y = encryptedEmail.getNumberOfCharactersPerLine();
        for (int i =0; i < x; i++ ){
            for(int j = 0; j < y; j++) {
                System.out.print(encryptedEmail.decryptChar(i,j));
            }
        System.out.print("\n"); 
        }
    }
}
