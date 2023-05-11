package com.ed2;

import com.utils.BinarySearch;
import com.utils.RandomNumberGenerator;
import com.utils.SearchInTree;
import com.utils.SequentialSearch;
import com.utils.TreePrinter;
import com.utils.NumPrinterTxt;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        
        RandomNumberGenerator generator = new RandomNumberGenerator(20); 
        ArrayList<Long> numbers = generator.getNumbers(); 
        
        NumPrinterTxt numPrinter = new NumPrinterTxt();
        numPrinter.printNumList(numbers, "twenty-numbers.txt");
        
        TreeNode<Long> root = new TreeNode<>(Long.valueOf(10));
        root.insertArray(numbers);
        
        SequentialSearch sequentialSearch = new SequentialSearch();
        BinarySearch binarySearch = new BinarySearch();
        SearchInTree<Long> treeSearch = new SearchInTree<>();
        
        TreePrinter<Long> treePrinter = new TreePrinter<>();         

        sequentialSearch.search(numbers, generator.getChosenNumber());
        binarySearch.search(numbers, generator.getChosenNumber());      
        treeSearch.search(root, generator.getChosenNumber());
        
        treePrinter.print(root);
                
        RandomNumberGenerator millionGenerator = new RandomNumberGenerator(10000000);
        ArrayList<Long> millionNumbers = millionGenerator.getNumbers();
        
        NumPrinterTxt numPrinterMillionNumbers = new NumPrinterTxt();
        numPrinterMillionNumbers.printNumList(millionNumbers, "million-numbers.txt");
        
        TreeNode<Long> rootMillion = new TreeNode<>(millionGenerator.getChosenRoot());
        rootMillion.insertArray(millionNumbers);
        
        SequentialSearch sequentialSearchMillion = new SequentialSearch();
        BinarySearch binarySearchMillion = new BinarySearch();
        SearchInTree<Long> treeSearchMillion = new SearchInTree<>();   
       
        sequentialSearchMillion.search(millionNumbers, millionGenerator.getChosenNumber());
        binarySearchMillion.search(millionNumbers, millionGenerator.getChosenNumber());
        treeSearchMillion.search(rootMillion, millionGenerator.getChosenNumber());
    }
}
