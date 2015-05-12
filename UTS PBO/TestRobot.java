public class TestRobot
{
	public static void main(String[] args)
	{
		Asimo25 unit = new Asimo25 (30, 150, 1000, 5);
		unit.CetakSpesifikasi();
		unit.Upgrade(20);
		unit.Upgrade(25);
	}
}
