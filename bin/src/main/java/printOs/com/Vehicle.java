class Vehicle{
    int maxSpeed = 120;
    int minSpeed = 10;
    double weight = 1000;
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";
    
    public void printVariables(){
        System.out.println("This is the maxSpeed: " + maxSpeed);
        System.out.println("This is the minSpeed: " + minSpeed);
        System.out.println("This is the weight: " + weight);
        System.out.println("This is the condition: " + condition);
        System.out.println("This is the nameOfCar: " + nameOfCar);
    }
    
    public void upgradeSpeed(){
        maxSpeed = maxSpeed + 10;
    }
    
    public void getIn(){
        isTheCarOn = true;
    }
    
    public void getOut(){
        isTheCarOn = false;
    }
    
    public double howManyMilesTillOutOfGas(){
        return weight * condition;
    }
    
    public double maxMilesPerFillUp(){
        return maxSpeed * weight;
    }
    
    public static void main(String[] args){
        Vehicle familyCar = new Vehicle();
        System.out.println("Family's Car: ");
        familyCar.printVariables();
        familyCar.getIn();
        familyCar.getIn();
        familyCar.getIn();
        System.out.println("Miles till out of gas: " + familyCar.howManyMilesTillOutOfGas());
        System.out.println("Max miles per fill up: " + familyCar.maxMilesPerFillUp());
        System.out.println("Car is on: " + familyCar.isTheCarOn);
        System.out.println("Car is on: " + familyCar.isTheCarOn);
        System.out.println("Car is on: " + familyCar.isTheCarOn);
        familyCar.getOut();
        System.out.println("Car is on: " + familyCar.isTheCarOn);
    }
}