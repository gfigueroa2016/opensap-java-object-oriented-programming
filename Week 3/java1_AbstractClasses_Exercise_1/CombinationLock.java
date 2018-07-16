class CombinationLock extends SecurityDevice {
    public boolean open(int code){
        return code == 1337 ? true : false;
    }
}
