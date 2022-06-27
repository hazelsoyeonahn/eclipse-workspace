package ass;
/*
 * This class help sorting files
 * It won't compile using GUI so there is a main in this class
 * This class will receive input from user to set limit number
 * Then it will read file from txt file in the folder called "appned.txt"
 * It will make a new array of String to make new array with limited Strings.
 * Then quickSort it
 * After sorting, it will output to temporary file of newly made string
 * Then it will read in files.
 * The reading files will generate into newly created array,
 * then mergeSort so there are only one string at the end. 
 * However, at mergeSort stage it refuse to type cast when using Comparable
 * 
 */
import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileSorter<E extends Comparable> {
	
	//declare limit and fileName
	int limit;
	String fileName;
	
	//constructor that gets limit and fileName as parameters
	public FileSorter(int limit, String fileName) {
		this.limit = limit;
		this.fileName = fileName;
	}
	
	//readFile method that gets limit and fileNamse as parameters
	public static void readFile(int limit, String fileName) throws IOException{
		
		//reading txt file
		String content = new String(Files.readAllBytes(Paths.get(fileName)), StandardCharsets.UTF_8);
		//printing the whole file
		//System.out.println(content);
		//split the file
		System.out.println("Splitting....");
		System.out.println("*************");
		String[] splitString = content.split(" ");
		
		//count until reach the limit then move to next array
		int count = 0;
		//count for new String
		int spCount = 0;
		//count how mnay arrays are there in splitString
		int spStringCount = 0;
		for(String s : splitString) {
			System.out.println(s); //printing splitString
			++spStringCount;
		}
		
		//new array of string
		String[] splitLimit = new String[limit];
		String tempFile = "file";
		String[] readFile = new String[(spStringCount/limit)+1];
		int fileCount = 0;
		
		//loop until spllitString finishes
		for(int i=0; i<spStringCount; ++i) {
			//save splitted string in one string with a limited number of string
			splitLimit[spCount] = splitString[i];
			++count;
			++spCount;
			//make sure to output file in limited number of strings
			if(spCount == limit) {
				sort(splitLimit); //qsort the newly arranged array
				printArray(splitLimit); //print out qsorted newly arranged array
				System.out.println("\n");
				//when spCount reaches limit spCount=0
				spCount = 0;
				//create temporarly file to save newly arranged array
				File temp = File.createTempFile(tempFile+count, ".txt");
				BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
				for(int j=0; j<limit; j++) {
					bw.write(splitLimit[j]+" ");
				}
				bw.close();
				
				
				//read file
				BufferedReader br = new BufferedReader(new FileReader(temp));
				while((readFile[fileCount] = br.readLine())!= null) {
					System.out.println("File Output:" + readFile[fileCount]);
					++fileCount;
				}
			}
		}
		mergeSort(readFile);
		
	}
	
	//this method is the entry of quicksort
	public static void sort(String[] splitLimit) {
		quickSort(splitLimit, 0, splitLimit.length);
	}
	
	private static void quickSort(String[] splitLimit, int start, int end) {
		if(end-start>1) {
			int indexPartition = partition(splitLimit, start, end);
			quickSort(splitLimit, start, indexPartition);
			quickSort(splitLimit, indexPartition+1, end);
		}
	}
	
	private static int partition(String[] splitLimit, int start, int end){
		String temp;
		String partitionElement = splitLimit[start];
		int leftIndex = start;
		int rightIndex = end-1;
		
		while(leftIndex<rightIndex) {
			while(splitLimit[leftIndex].compareTo(partitionElement)<=0 && leftIndex<rightIndex)
				leftIndex++;
			while(splitLimit[rightIndex].compareTo(partitionElement)>0)
				rightIndex--;
			if(leftIndex<rightIndex) {
				temp = splitLimit[leftIndex];
				splitLimit[leftIndex] = splitLimit[rightIndex];
				splitLimit[rightIndex] = temp;
			}
		}
		splitLimit[start] = splitLimit[rightIndex];
		splitLimit[rightIndex] = partitionElement;
		return rightIndex;
	}
	public static void mergeSort(String[] readFile) {
		mergeSortSegment(readFile, 0, readFile.length);
	}
	
	public static void mergeSortSegment(String[] readFile, int start, int end) {
		int numElements = end-start;
		if(numElements>1) {
			int middle = (start+end)/2;
			//sort the part to the left of middle
			mergeSortSegment(readFile,start,middle);
			//sort the part to the right of middle
			mergeSortSegment(readFile,middle,end);
			//copy the two parts elements into a temporary array
			String[] tempList = (String[])(new Comparable[numElements]); //unchcked //crashing cast failing here....
			for(int i=0; i<numElements; i++)
				tempList[i] = readFile[start+i];
			//merge the two sorted parts from tempList back into list
			int indexLeft = 0; //current index of left part
			int indexRight = middle - start; //current index of right
			
			for(int i=0; i<numElements; i++) {
				//determine which element to next put in list
				if(indexLeft<(middle-start)) {
					if(indexRight<(end-start))//right part also has elem
					{
						if(tempList[indexLeft].compareTo(tempList[indexRight])>0)//left element smaller
							readFile[start+i] = tempList[indexLeft++];
						else //right element smaller
							readFile[start+i] = tempList[indexRight++];
					}
					else //take element from left part
						readFile[start+i] = tempList[indexLeft++];
				}
				else //take element from right part
					readFile[start+i] = tempList[indexRight++];
			}
		}
	}
	
	//print array of string
	public static void printArray(String[] arr) {
		for(String i : arr) {
			System.out.print(i+" ");
		}
	}
	
public static void main(String[] args) throws IOException{
		readFile(20,"append.txt");
}
}
