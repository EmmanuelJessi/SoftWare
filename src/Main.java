import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String pupilName;
        String dateOfBirth;
        String pupilGender;
        String pupilStream;
        String schoolTerm;
        int marksForReading;
        int marksForSpellingBee;
        int marksForSinging;
        int marksForStoryTelling;

        // System Title
        System.out.println("ABC PRI-SCHOOL SOFTWARE!");

        // importing scanner class
        Scanner scanner = new Scanner(System.in);

        // reading from keyboard

        // pupil name
        System.out.print("Enter Pupil's Name: ");
        pupilName = scanner.nextLine();

        // pupil date of birth
        System.out.print("Enter Pupil's Date of Birth: ");
        dateOfBirth = scanner.nextLine();

        // pupil gender
        System.out.print("Enter Pupil's Gender: ");
        pupilGender = scanner.nextLine();

        // pupil stream
        System.out.print("Enter Pupil's Stream: ");
        pupilStream = scanner.nextLine();

        // pupil school term
        System.out.print("Enter Pupil's School Term: ");
        schoolTerm = scanner.nextLine();

        // marks for reading
        System.out.print("Marks for reading: ");
        marksForReading = scanner.nextInt();

        // marks for spelling
        System.out.print("Marks for spelling: ");
        marksForSpellingBee = scanner.nextInt();

        // marks for singing
        System.out.print("Marks for singing: ");
        marksForSinging = scanner.nextInt();

        // marks for story telling
        System.out.print("Marks for story telling: ");
        marksForStoryTelling = scanner.nextInt();


        // total marks
        int totalMarks = marksForReading + marksForSpellingBee + marksForSinging + marksForStoryTelling;

        // average marks
        int averageMarks = (marksForReading + marksForSpellingBee + marksForSinging + marksForStoryTelling)/4;

        // displaying pupil information
        System.out.println("******** PUPIL DETAILS *********");
        System.out.println("Pupil Name: " + pupilName);
        System.out.println("Pupil Date of Birth: " + dateOfBirth);
        System.out.println("Pupil Gender: " + pupilGender);
        System.out.println("Pupil Stream: " + pupilStream);
        System.out.println("Pupil School Term: " + schoolTerm);
        System.out.println("Pupil Marks for Reading: " + marksForReading);
        System.out.println("Pupil Marks for Spelling: " + marksForSpellingBee);
        System.out.println("Pupil Marks for Singing: " + marksForSinging);
        System.out.println("Pupil Marks for Storytelling: " + marksForStoryTelling);
        System.out.println("Pupil Total Marks: " + totalMarks + "/400");
        System.out.println("Pupil Average Marks: " + averageMarks);
        System.out.println("Pupil Class Strength: " + (averageMarks/25) + 5);


    }
}