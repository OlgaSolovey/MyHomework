package Hospital;

public class Therapist extends Doctor {
    Patient patient = new Patient(1);

    public void planTherapist(Patient plan) {
        if (patient.plan == 1) {
            Surgeon surgeon = new Surgeon();
            surgeon.treat();
        } else if (patient.plan == 2) {
            Dentist dentist = new Dentist();
            dentist.treat();
        } else {
            Therapist therapist = new Therapist();
            therapist.treat();
        }

    }
    @Override
    public void treat() {
        System.out.println("Treat Therapist");
    }


}
