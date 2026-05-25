public class Dragon 
{
    private String attack;
    private int level;
    
    // Write the constructor here!
    public Dragon(int _level, String _attack)

        {

            this.level = _level;

        this.attack = _attack;

        }

        public String getAttack()
        
        {

        return this.attack;

        }

        public int getLevel()

        {

        return this.level;

        }

        public String fight()

        {

        String r = "";

        for(int i = 0; i < level; i++)

        {

        r += attack;

        }

        return r;

        }
    
    // Put getters here
    
    // Put other methods here
    

    // String representation of the object
    public String toString()
    {
        return "Dragon is at level " + level + " and attacks with " + attack;
    }
}