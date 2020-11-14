package collections;

public class Country {
    String name;
    int population;

    public Country(String name, int population)
    {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    //hascode method


    @Override
    public int hashCode() {
         int result = 1;

       final int prime = 31;

        result = result*prime + ((name == null)?0:name.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Country other = (Country) obj;
        if(name == null)
        {
            if(other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;

            return true;
    }

}
