package web.model;


public class Car {

    private String model;
    private String body;
    private String yearsOfProduction;


    public Car(String model, String body, String yearsOfProduction) {
        this.model = model;
        this.body = body;
        this.yearsOfProduction = yearsOfProduction;
    }

    public String getModel() {
        return model;
    }

    public String getBody() {
        return body;
    }

    public String getYearsOfProduction() {
        return yearsOfProduction;
    }


}
