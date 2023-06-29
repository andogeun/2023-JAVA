package s0629;

public class Tv implements Sound{
	private int tv_Sound;
	
	
	@Override
	public void SoundUp(int level) {
		tv_Sound += (level * 2);
		System.out.println("TV 볼륨 Down: " + tv_Sound);
	}

	@Override
	public void SoundDown(int level) {
		tv_Sound -= (level * 2);
		if(tv_Sound<level)
			tv_Sound=0;
		System.out.println("TV 볼륨 Down: " + tv_Sound);
	}

	public int getTv_Sound() {
		return tv_Sound;
	}
	
	
}
