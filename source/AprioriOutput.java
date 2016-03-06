import weka.associations.Apriori;
import weka.associations.PredictiveApriori;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class AprioriOutput {  
	
	public static void main(String[] args) throws Exception {
    //Especificar la ruta del DATASET
	  Instances data = DataSource.read("C:/Users/CIMA-IT/Desktop/Proyecto_Final/Dataset/datostwitter_final.arff");
    data.setClassIndex(data.numAttributes() - 1);
    PredictiveApriori pre_ap = new PredictiveApriori();
    pre_ap.setClassIndex(data.classIndex());
    pre_ap.buildAssociations(data);
  
    System.out.println(pre_ap);
   
  }
}
