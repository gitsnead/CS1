public class Reformatory {

    private int totalMeasurements = 0;
    
    public int weight(Person person) {
        // return the weight of the person
        this.totalMeasurements++;
        return person.getWeight();
    }
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int totalWeightsMeasured() {
        return totalMeasurements;
    }

    public void setTotalMeasurements(int totalMeasurements) {
        this.totalMeasurements = totalMeasurements;
    }

}
