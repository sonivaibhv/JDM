import java.io.IOException;

import ai.Cluster;
import net.sf.javaml.clustering.SOM;
import net.sf.javaml.clustering.evaluation.ClusterEvaluation;
import net.sf.javaml.core.Dataset;
import net.sf.javaml.distance.DistanceMeasure;

public class JDMCluster extends JDMLearning{
	
	Cluster cluster;
	
	public JDMCluster(){
		cluster = new Cluster();
	}
	
	public Dataset[] cobweb(String path, int key) throws IOException{
		return cluster.cobweb(path, key);
	}
	public Dataset[] cobweb(String path, int key, double acuity, double cutoff) throws IOException{
		return cluster.cobweb(path, key, acuity, cutoff);
	}
	
	public Dataset[] farthestFirst(String path, int key) throws IOException{
		return cluster.farthestFirst(path, key);
	}
	public Dataset[] farthestFirst(String path, int key, int numClusters, DistanceMeasure dm) throws IOException{
		return cluster.farthestFirst(path, key, numClusters, dm);
	}
	public Dataset[] kMeans(String path, int key, int numberOfClusters, int numberOfIterations) throws IOException{
		return cluster.kMeans(path, key, numberOfClusters, numberOfIterations);
	}
	public Dataset[] multiKMeans(String path, int key, ClusterEvaluation ce) throws IOException{
		return cluster.multiKMeans(path, key, ce);
	}
	public Dataset[] multiKMeans(String path, int key, int clusters, int iterations, int repeats, DistanceMeasure dm, ClusterEvaluation ce) throws IOException{
		return cluster.multiKMeans(path, key, clusters, iterations, repeats, dm, ce);
	}
	
	public Dataset[] som(String path, int key) throws IOException{
		return cluster.som(path, key);
	}
	public Dataset[] som(String path, int key, int xdim, int ydim, SOM.GridType grid, int iterations, double learningRate, int initialRadius, SOM.LearningType learning, SOM.NeighbourhoodFunction nbf) throws IOException{
		return cluster.som(path, key, xdim, ydim, grid, iterations, learningRate, initialRadius, learning, nbf);
	}
	public Dataset[] som(String path, int key, int xdim, int ydim, SOM.GridType grid, int iterations, double learningRate, int initialRadius, SOM.LearningType learning, SOM.NeighbourhoodFunction nbf, DistanceMeasure dm) throws IOException{
		return cluster.som(path, key, xdim, ydim, grid, iterations, learningRate, initialRadius, learning, nbf, dm);
	}
}
