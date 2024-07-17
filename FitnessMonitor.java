
public interface FitnessMonitor {
    // Fill the code here
    String findFitnessLevel();

    public static double calculateCaloriesBurnt(double weight, double distanceCovered, boolean runningStatus) {
        double calories = 0;
        if (runningStatus) {
            calories = 0.75 * weight * distanceCovered;
        } else {
            calories = 0.53 * weight * distanceCovered;
        }

        return calories;
    }
}
