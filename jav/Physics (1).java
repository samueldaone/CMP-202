package java3;

public class Physics {
    float calcVel(float distance, int time){
        return distance/time;
    }
    float calcVel(float initialVal, int acceleration, int time){
        return initialVal + (acceleration * time);
    }
}
