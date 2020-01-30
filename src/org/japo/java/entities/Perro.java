/*
 * Copyright 2020 Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.entities;

import java.io.Serializable;

/**
 *
 * @author Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es
 */
public class Perro implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    public static final boolean DEF_CUARENTENA = false;
    
    private boolean cuarentena;

    public Perro() {
        cuarentena = DEF_CUARENTENA;
    }

    public Perro(boolean cuarentena) {
        this.cuarentena = cuarentena;
    }
    
    
    public boolean isCuarentena() {
        return cuarentena;
    }

    public void setCuarentena(boolean cuarentena) {
        this.cuarentena = cuarentena;
    }
    
       @Override
   public final boolean equals(Object o) {
      boolean testOK;
      if (o == null) {
         testOK = false;
      } else if (!(o instanceof Perro)) {
         testOK = false;
      } else {
         testOK = cuarentena == ((Perro)o).isCuarentena();
      }
      return testOK;
   }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.cuarentena ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() { 
        return String.format("%s - %b - %s", getClass().getSimpleName(),
                cuarentena, cuarentena ? "SI ha pasado la cuarentena" 
                        : "NO ha pasado la cuarentena");
    }
    
    
    
}
