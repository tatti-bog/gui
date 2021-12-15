package com.company;
import java.io.*;

public class Saving {



    // save item into project
//save project just save file

//save store
//save item to leftover

// general function for saving


    // create a  new file with the project name

    public void createFile (String name)
    {
       // File file  = new File ( name + ".txt"); // what if multiple files with the sma name
        File file2  = new File ( "C:\\Users\\tatii\\IdeaProjects\\gui\\" + name + ".txt");
        boolean result;
        try
        {
            result = file2.createNewFile();  //creates a new file
            if(result)      // test if successfully created a new file
            {
                System.out.println("file created "+file2.getCanonicalPath()); //returns the path string
            }
            else
            {
                System.out.println("File already exist at location: "+file2.getCanonicalPath());
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();    //prints exception if any
        }


    }


    public void save (String name, String text)
    {
        BufferedWriter writer;
        {
            try {
                writer = new BufferedWriter(new FileWriter(name+".txt"));

                writer.write(text);
                writer.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }








// what the reader function will return

//    {
//        BufferedReader reader;
//        try {
//            reader = new BufferedReader(new FileReader(write the name of the file + ".txt"));
//            String line ;
//
//           while ((line= reader.readLine())!= null){
//               System.out.println(line);
//           }
//           reader.close();
//
//        }
//
//
//        catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

}