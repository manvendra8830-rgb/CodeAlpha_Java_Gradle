
package org.example;

public class App {

    public static String getProjectName() {
        return "CodeAlpha Java Gradle Project";
    }

    public static String getStatus() {
        return "Application is running successfully!";
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("       CODEALPHA DEVOPS PROJECT");
        System.out.println("====================================");

        System.out.println("Project: " + getProjectName());
        System.out.println("Status: " + getStatus());
        System.out.println("Language: Java");
        System.out.println("Build Tool: Gradle");
        System.out.println("Testing: JUnit Jupiter");

        System.out.println("------------------------------------");
        System.out.println("Example Calculation:");
        System.out.println("10 + 20 = " + add(10, 20));

        System.out.println("====================================");
        System.out.println("       APPLICATION COMPLETED");
        System.out.println("====================================");
    }
}
