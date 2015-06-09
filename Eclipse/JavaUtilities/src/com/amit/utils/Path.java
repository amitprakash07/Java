
/*Path:
    Path(String absPath)
    cd(String path)
    String getAbsPath()

"/a/b"

"/x/y/z" -> "/x/y/z"
"./x/y/z" -> "/a/b/x/y/z"
"x/y/z"   -> "/a/b/x/y/z"
"x/../../z" ->  "/a/z"
"/a/x/./././///z" -> "/a/x/z"*/

package com.amit.utils;
import java.util.Stack;

public class Path
{
    public Path(String absPath)
    {
    	this();
    	String a[] = absPath.split("/");
        for(int i=0; i< a.length;i++)
        {
        	if(!a[i].equals(""))
        		absolutePath.push(a[i]);
        }
    }
    
    private Path()
    {
    	absolutePath = new Stack<String>();
    }
       
    
    public String cd(String newPath)
    {
       String [] t= newPath.split("/");
       //"/a/x/./././///z"
       
       if(t[0].equals(""))
    	   absolutePath.clear();
       
    	   
       /*
       "/a/b"

       "/x/y/z" -> "/x/y/z"
       "./x/y/z" -> "/a/b/x/y/z"
       "x/y/z"   -> "/a/b/x/y/z"
       "x/../../z" ->  "/a/z"
       "/a/x/./././///z" -> "/a/x/z"
       */
       
       for(int i=0;i<t.length;i++)
 	   {
 		  if(t[i].equals(".."))
 			  absolutePath.pop();
 		  else if(t[i].equals(".") || t[i].equals(""))
 			  continue;
 		  else
 			  absolutePath.push(t[i]);
 	   }
       
       String returnPath = "/";
       
       for(int i=0; i< absolutePath.size();i++)
             returnPath = returnPath + absolutePath.get(i) +"/";
              
       return returnPath;
      }
    
    private Stack<String> absolutePath;
    
}



