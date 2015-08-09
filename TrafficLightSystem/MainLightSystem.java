package TrafficLightSystem;

import TrafficLightSystem.LightSystem.TrafficSignalDirection;

public class MainLightSystem {
	public static void main(String args[]){
		//Initialize the Light System with four directions  
		LightSystem ls = new LightSystem(TrafficSignalDirection.values());
		//Infinite for loop to run the traffic light forever
		for(;;){
		ls.trafficStart();
	}
	}
}
