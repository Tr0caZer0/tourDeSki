package application;

import java.util.ArrayList;
import java.util.List;

public class SkierProperty extends Skier{
	
	public List<Skier> skiers = new ArrayList<>();
	
	public void addSkier(Skier newSkier) {
		skiers.add(newSkier);
	}
	
}
