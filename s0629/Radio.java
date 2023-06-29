package s0629;

public class Radio implements Sound{
	private int R_Sound;
	
	
	@Override
	public void SoundUp(int level) {
		R_Sound += level;
		System.out.println("라디오 볼륨 Up: " + R_Sound);
	}

	@Override
	public void SoundDown(int level) {
		R_Sound -= level;
		if(R_Sound<level)
			R_Sound=0;
		System.out.println("라디오 볼륨 Down: " + R_Sound);
}

	public int getR_Sound() {
		return R_Sound;
	}
	
	
}
