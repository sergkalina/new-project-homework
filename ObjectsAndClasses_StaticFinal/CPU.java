public class CPU {

   private final double frequency;
   private final int amountCores;
   private final double performance;   //Терафлопсах
   private final int weight;

   public CPU(double frequency, int amountCores, double performance, int weight) {
       this.frequency = frequency;
       this.amountCores = amountCores;
       this.performance = performance;
       this.weight = weight;
   }
   public double getFrequency() {
       return frequency;
   }
   public int getAmountCores() {
       return amountCores;
   }
   public double getPerformance() {
       return performance;
   }
   public int getWeight() {
       return weight;
   }

}
