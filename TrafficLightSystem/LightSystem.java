package TrafficLightSystem;

import TrafficLightSystem.LightSystem.TrafficSignalDirection;

public class LightSystem {
	//Constant enum for the direction
	TrafficSignalDirection[] direction;
	enum TrafficSignalDirection {
		EAST, WEST, SOUTH, NORTH
	}
	
public LightSystem(TrafficSignalDirection[] values) {
	this.direction=values;
	}
public void trafficStart(){
	for(int i=0;i<direction.length;i++){
	switch(direction[i]){
	case EAST:
		System.out.println("East is green");
		Vehicle.letCarPasses();
		break;
	case WEST:
		System.out.println("West is green");
		Vehicle.letCarPasses();
		break;
	case SOUTH:
		System.out.println("SOUTH is green");
		Vehicle.letCarPasses();
		break;
	case NORTH:
		System.out.println("NORTH is green");
		Vehicle.letCarPasses();
		break;
		
	}
	
}}
}
