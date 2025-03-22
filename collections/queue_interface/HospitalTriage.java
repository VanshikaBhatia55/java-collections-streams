package java_collections_streams.collections.queue_interface;

import java.util.PriorityQueue;

public class HospitalTriage {
    static class Patient implements Comparable<Patient> {
        String name;
        int severity;

        Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }

        @Override
        public int compareTo(Patient other) {
            return Integer.compare(other.severity, this.severity);
        }

        @Override
        public String toString() {
            return name + " (Severity: " + severity + ")";
        }
    }

    public static void triage(Patient[] patients) {
        PriorityQueue<Patient> pq = new PriorityQueue<>();
        for (Patient p : patients) {
            pq.offer(p);
        }
        System.out.println("Treatment Order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }

    public static void main(String[] args) {
        Patient[] patients = {
                new Patient("Harshita", 3),
                new Patient("Aman", 5),
                new Patient("Bhuvan", 2)
        };
        triage(patients);
    }
}