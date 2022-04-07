/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

import java.util.function.Supplier;
import static java.lang.System.out;

public class App 
{
    public static void main( String[] args )
    {
        out.println( "Hello Remote World!" );
        new Helper().f2 = 3;
        Supplier<String> sup = () -> new String("d");
        out.println(sup.get());
    }

    static class Helper {
        public int f2;
    }
}
