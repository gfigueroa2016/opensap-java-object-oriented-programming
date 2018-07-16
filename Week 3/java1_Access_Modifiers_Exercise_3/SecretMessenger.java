class SecretMessenger {
	private String message = "Eric once tried to barbecue a parrot";
    
    private void deleteMessage(){
        this.message = "";
    }
    
    void retrieveMessage(String message){
        if (message.equals("taradiddle")){
            System.out.println(this.message);
            deleteMessage();
        }
    }
}
