package homework7;

public class Stats {
    private float endurance;
    private float sprint;
    private float dribble;
    private float passing;
    private float shooting;

        public static float calculateAverage(float endurance,float sprint,float dribble,
                                          float passing,float shooting) {
        float result = (endurance + sprint + dribble + passing + shooting) / 5;
        return result;
    }



}


