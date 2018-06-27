class ToDoList {

    public static void main(String[] args) {
        Task buyMilk = new Task("Buy some milk", 2);
        Task cleanUpOffice = new Task("Get rid of all the dust in the office", 1);
        Task catchVillain = new Task("Catch the villain", 5);
        
        System.out.println(buyMilk.description + "\t" + buyMilk.importance);
        System.out.println(cleanUpOffice.description + "\t" + cleanUpOffice.importance);
        System.out.println(catchVillain.description + "\t" + catchVillain.importance);

    }

}
