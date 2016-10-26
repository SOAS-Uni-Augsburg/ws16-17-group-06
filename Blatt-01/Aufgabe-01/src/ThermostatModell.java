
public class ThermostatModell {
double[] outsideTemp= new double[] {10.0, 25.0, 30.0};
double tMin = 15.0;
double tMax = 20.0;
double current = 18.0;
public void run(){
	for(int i =0;i<outsideTemp.length;i++){
		//Mischlufttemperatur berechnen
		double m = (current+outsideTemp[i])/2;
		if(m<tMin) current = current +5;
		else if(m>tMax)current = current  - 5;
		if(current>tMax)current=tMax;
		else if(current<tMin)current=tMin;
		System.out.println(current);
	}
}
}
