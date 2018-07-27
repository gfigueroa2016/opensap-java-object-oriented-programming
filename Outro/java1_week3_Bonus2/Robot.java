public class Robot {
    
	private String task;
	private int batteryRuntime = 10;

	public void setTask(String newTask){
		this.task = newTask;
		printTask();
	}
	
	public String getTask(){
		return task;
	}
	
	public int getBatteryRuntime(){
		return batteryRuntime;
	}
	
	protected void
	setBatteryRuntime(int newRuntime){
		if (newRuntime > 0){
			System.out.println("The new runtime is: " + newRuntime);
			this.batteryRuntime = newRuntime;	
		}
	}
	
	public void work(){
		int runtime = getBatteryRuntime();
		if (runtime > 0){
			runtime = runtime - 1;
			setBatteryRuntime(runtime);
		}
	}
	
	public void printTask(){
		System.out.println("Now I am working on: " + getTask());
	}
}
