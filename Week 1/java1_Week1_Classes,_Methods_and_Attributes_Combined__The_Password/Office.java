class Office {
    PasswordGenerator pg = new PasswordGenerator();
    String password;
    
    void printPassword() {
        password = pg.getPassword();
        System.out.println(password);
        
    } 

}
