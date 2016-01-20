import java.io.IOException;
import java.util.ArrayList;

import ai.Classificator;
import net.sf.javaml.classification.Classifier;
import net.sf.javaml.clustering.SOM.GridType;
import net.sf.javaml.clustering.SOM.LearningType;
import net.sf.javaml.clustering.SOM.NeighbourhoodFunction;

public class JDMClassificator extends JDMLearning{
	
	Classificator classificator;
	
	public JDMClassificator(){
		classificator = new Classificator();
	}
	
	public Classifier kDtreeKNN(String path, int key) throws IOException, IllegalArgumentException {
		return classificator.kDtreeKNN(path, key);
	}
	public Classifier randomForest(String path, int key, int numberOfTrees) throws IllegalArgumentException, IOException {
		return classificator.randomForest(path,key, numberOfTrees);
	}
	public Classifier kNearestNeighbors(String path,  int key, int neighbors) throws IOException, IllegalArgumentException {
		return classificator.kNearestNeighbors(path, key, neighbors);
	}
	
	public Classifier nearestMeanClassifier(String path, int key)
			throws IOException, IllegalArgumentException {
		return classificator.nearestMeanClassifier(path, key);
	}
	public Classifier meanFeatureVotingClassifier(String path, int key)
			throws IOException, IllegalArgumentException {
		return classificator.meanFeatureVotingClassifier(path, key);
	}
	public Classifier som(String path, int key, int xdim, int ydim,GridType grid, int iterations, double learningRate, int initialRadius, LearningType learning, NeighbourhoodFunction nbf)
			throws IOException, IllegalArgumentException {
		return classificator.som(path, key, xdim, ydim, grid, iterations, learningRate, initialRadius, learning, nbf);
	}
	public Classifier zeroR(String path, int key)
			throws IOException, IllegalArgumentException {
		return classificator.zeroR(path, key);
	}
	
	public ArrayList<Object> clasify(String path, int key, Classifier tree) throws IOException{
		return classificator.clasify(path, key, tree);
	}
	
	
}
