package AIOGoldFarmer;

import org.powerbot.script.Area;
import org.powerbot.script.Tile;
import org.powerbot.script.rt4.ClientAccessor;
import org.powerbot.script.rt4.GameObject;
import org.powerbot.script.rt4.ClientContext;

public class Gcons {
	//--------------npcs--------------//
    //ids
	//goblins
    public static int GOBLIN_NPC_ID = 3308;

    //items
    public static int BRONZE_SWORD_ITEM_ID = 1277;
    public static int WOODEN_SHIELD_ITEM_ID = 1171;
    public static int BRONZE_PICKAXE_ITEM_ID = 1265;
    
    //varrock
    //vwest bank clerk
    
    //veast bank clerk
    
    //ge bank clerk
    //ge buyer dude
    
	//object ids
    public final static int TBANK_OBJECT_ID = 10083;
    public final static int FIRST_DOOR_ID = 9398;
	
    //--------------objects--------------//
    //public final GameObject OBJECT = ctx.objects.select().id(TBANK_OBJECT_ID).nearest().poll();
    public final int[] OBJECT_BOUNDS = {116, 132, -176, 0, 8, 116};
	//OBJECT.bounds(bounds);
    
    // first room
	public final static String FIRST_STRING = "<col=0000ff>Getting started</col><br>Before you begin, have a read through";
    
	//--------------areas--------------//
	public static Area TUTORIAL_ISLAND_AREA;
	public static Area LUMMY_CITY_AREA;
	public static Area LUMMY_SWAMP_AREA;
	public static Area LUMMY_CASTLE_AREA;
	public static Area LUMMY_GOBLIN_AREA;
	public static Area LUMMY_SOUTH_MINING_AREA;
	public static Area LUMMY_SOUTHWEST_MINING_AREA;
	public static Area SPAWN_AREA;
	
	public static void INITIALIZE_AREAS() {
	
		TUTORIAL_ISLAND_AREA = new Area(new Tile(3056, 3147, 0), new Tile(3024, 3082, 0), new Tile(3055, 3031, 0), new Tile(3137, 3040, 0),
				new Tile(3147, 3061, 0), new Tile(3171, 3068, 0), new Tile(3168, 3132, 0), new Tile(3142, 3134, 0), new Tile(3133, 3144, 0), new Tile(3088, 3143, 0),
				new Tile(3079, 3149, 0));
		
	    LUMMY_GOBLIN_AREA = new Area(new Tile(3248, 3225, 0), new Tile(3250, 3223, 0), new Tile(3252, 3223, 0), new Tile(3255, 3221, 0),
	    		new Tile(3257, 3219, 0), new Tile(3259, 3218, 0), new Tile(3262, 3214, 0), new Tile(3267, 3214, 0), new Tile(3267, 3223, 0), new Tile(3268, 3224, 0),
	    		new Tile(3268, 3232, 0), new Tile(3267, 3233, 0), new Tile(3267, 3239, 0), new Tile(3266, 3240, 0), new Tile(3266, 3247, 0), new Tile(3265, 3248, 0),
	    		new Tile(3265, 3255, 0), new Tile(3238, 3255, 0), new Tile(3238, 3250, 0), new Tile(3239, 3235, 0), new Tile(3247, 3228, 0), new Tile(3248, 3227, 0),
	    		new Tile(3254, 3227, 0), new Tile(3255, 3225, 0));
	
	    LUMMY_SOUTH_MINING_AREA = new Area(new Tile(3222, 3153, 0), new Tile(3220, 3147, 0), new Tile(3225, 3142, 0), new Tile(3233, 3142, 0),
	    		new Tile(3233, 3148, 0), new Tile(3228, 3153, 0));
	    
	    LUMMY_SOUTHWEST_MINING_AREA = new Area(new Tile(3142, 3163, 0), new Tile(3132, 3146, 0), new Tile(3144, 3134, 0), new Tile(3158, 3140, 0));
	    
	    LUMMY_CASTLE_AREA = new Area(new Tile(3201, 3234, 0), new Tile(3204, 3237, 0), new Tile(3213, 3237, 0), new Tile(3215, 3235, 0),
	    		new Tile(3221, 3235, 0), new Tile(3227, 3229, 0), new Tile(3227, 3225, 1), new Tile(3228, 3226, 1), new Tile(3230, 3226, 1), new Tile(3231, 3225, 1),
	    		new Tile(3231, 3222, 1), new Tile(3230, 3221, 1), new Tile(3230, 3217, 0), new Tile(3231, 3216, 0), new Tile(3231, 3213, 0), new Tile(3230, 3212, 0),
	    		new Tile(3228, 3212, 0), new Tile(3227, 3213, 0), new Tile(3227, 3209, 0), new Tile(3221, 3203, 0), new Tile(3215, 3203, 0), new Tile(3213, 3201, 0),
	    		new Tile(3204, 3201, 0), new Tile(3201, 3204, 0), new Tile(3201, 3217, 0), new Tile(3200, 3217, 0), new Tile(3199, 3218, 0), new Tile(3199, 3219, 0),
	    		new Tile(3200, 3220, 0), new Tile(3201, 3220, 0));
	    
	    SPAWN_AREA = new Area(new Tile(3238, 3223, 0), new Tile(3234, 3218, 0), new Tile(3234, 3212, 0), new Tile(3239, 3213, 0),
				new Tile(3239, 3217, 0), new Tile(3243, 3217, 0));
    
	}
	
	//--------------walker--------------//
    public static final Tile[] BANK_TO_GOBLINS = {new Tile(3208, 3220, 2), new Tile(3206, 3224, 2), new Tile(3206, 3228, 2), new Tile(3205, 3228, 1),
    		new Tile(3205, 3228, 0), new Tile(3209, 3228, 0), new Tile(3213, 3228, 0), new Tile(3215, 3224, 0), new Tile(3215, 3220, 0), new Tile(3219, 3219, 0),
    		new Tile(3223, 3219, 0), new Tile(3227, 3219, 0), new Tile(3231, 3219, 0), new Tile(3235, 3220, 0), new Tile(3238, 3223, 0), new Tile(3242, 3225, 0),
    		new Tile(3246, 3225, 0), new Tile(3250, 3225, 0), new Tile(3254, 3226, 0), new Tile(3258, 3228, 0), new Tile(3254, 3230, 0), new Tile(3253, 3234, 0)};
    
    public static final Tile[] SPAWN_TO_GOBLINS = {new Tile(3237, 3220, 0), new Tile(3239, 3224, 0), new Tile(3243, 3225, 0), new Tile(3247, 3225, 0), new Tile(3251, 3225, 0), new Tile(3255, 3226, 0), new Tile(3258, 3229, 0), new Tile(3254, 3230, 0), new Tile(3253, 3234, 0)};
    
    public static final Tile[] CASTLE_TO_GOBLINS = {new Tile(3221, 3218, 0), new Tile(3221, 3218, 0), new Tile(3226, 3218, 0), new Tile(3231, 3218, 0),
			new Tile(3236, 3221, 0), new Tile(3240, 3225, 0), new Tile(3245, 3225, 0), new Tile(3250, 3225, 0), new Tile(3255, 3226, 0), new Tile(3258, 3230, 0),
			new Tile(3253, 3231, 0), new Tile(3251, 3236, 0)};
	
	public static final Tile[] CASTLE_TO_VWEST_BANK = {new Tile(3221, 3218, 0), new Tile(3221, 3218, 0), new Tile(3226, 3218, 0), new Tile(3231, 3218, 0),
			new Tile(3232, 3223, 0), new Tile(3232, 3228, 0), new Tile(3232, 3233, 0), new Tile(3233, 3238, 0), new Tile(3232, 3243, 0), new Tile(3232, 3248, 0),
			new Tile(3232, 3253, 0), new Tile(3231, 3258, 0), new Tile(3230, 3261, 0), new Tile(3235, 3261, 0), new Tile(3240, 3262, 0), new Tile(3241, 3266, 0),
			new Tile(3240, 3271, 0), new Tile(3240, 3276, 0), new Tile(3240, 3281, 0), new Tile(3239, 3286, 0), new Tile(3239, 3291, 0), new Tile(3239, 3296, 0),
			new Tile(3239, 3301, 0), new Tile(3235, 3306, 0), new Tile(3230, 3308, 0), new Tile(3225, 3313, 0), new Tile(3222, 3318, 0), new Tile(3221, 3323, 0),
			new Tile(3219, 3327, 0), new Tile(3214, 3332, 0), new Tile(3209, 3337, 0), new Tile(3206, 3342, 0), new Tile(3206, 3347, 0), new Tile(3206, 3352, 0),
			new Tile(3210, 3357, 0), new Tile(3210, 3362, 0), new Tile(3211, 3367, 0), new Tile(3211, 3372, 0), new Tile(3211, 3377, 0), new Tile(3211, 3382, 0),
			new Tile(3211, 3387, 0), new Tile(3211, 3392, 0), new Tile(3211, 3397, 0), new Tile(3211, 3402, 0), new Tile(3208, 3407, 0), new Tile(3203, 3412, 0),
			new Tile(3199, 3417, 0), new Tile(3194, 3422, 0), new Tile(3192, 3427, 0), new Tile(3188, 3428, 0), new Tile(3183, 3432, 0), new Tile(3183, 3432, 0),
			new Tile(3183, 3437, 0)};
	
	public static final Tile[] CASTLE_TO_GE = {new Tile(3220, 3218, 0), new Tile(3220, 3218, 0), new Tile(3225, 3218, 0), new Tile(3230, 3218, 0),
			new Tile(3232, 3222, 0), new Tile(3232, 3227, 0), new Tile(3232, 3232, 0), new Tile(3233, 3237, 0), new Tile(3233, 3242, 0),new Tile(3232, 3247, 0),
			new Tile(3232, 3252, 0), new Tile(3231, 3257, 0), new Tile(3229, 3261, 0), new Tile(3234, 3261, 0), new Tile(3239, 3262, 0), new Tile(3241, 3265, 0),
			new Tile(3240, 3270, 0), new Tile(3240, 3275, 0), new Tile(3240, 3280, 0), new Tile(3239, 3285, 0), new Tile(3239, 3290, 0), new Tile(3239, 3295, 0),
			new Tile(3239, 3300, 0), new Tile(3236, 3305, 0), new Tile(3231, 3307, 0), new Tile(3226, 3312, 0), new Tile(3223, 3317, 0), new Tile(3221, 3322, 0),
			new Tile(3220, 3327, 0), new Tile(3215, 3331, 0), new Tile(3210, 3336, 0), new Tile(3206, 3341, 0), new Tile(3206, 3346, 0), new Tile(3206, 3351, 0),
			new Tile(3209, 3356, 0), new Tile(3210, 3361, 0), new Tile(3211, 3366, 0), new Tile(3211, 3371, 0), new Tile(3211, 3376, 0), new Tile(3211, 3381, 0),
			new Tile(3211, 3386, 0), new Tile(3211, 3391, 0), new Tile(3211, 3396, 0), new Tile(3211, 3401, 0), new Tile(3209, 3406, 0), new Tile(3204, 3411, 0),
			new Tile(3200, 3416, 0), new Tile(3200, 3421, 0), new Tile(3198, 3426, 0), new Tile(3198, 3431, 0), new Tile(3198, 3436, 0), new Tile(3194, 3441, 0),
			new Tile(3193, 3446, 0), new Tile(3188, 3448, 0), new Tile(3183, 3452, 0), new Tile(3178, 3456, 0), new Tile(3173, 3461, 0), new Tile(3168, 3465, 0),
			new Tile(3166, 3469, 0), new Tile(3166, 3474, 0), new Tile(3166, 3479, 0), new Tile(3166, 3484, 0), new Tile(3165, 3487, 0)};
	
	public static final Tile[] CASTLE_TO_CLAY = {new Tile(3219, 3218, 0), new Tile(3219, 3218, 0), new Tile(3224, 3218, 0), new Tile(3229, 3218, 0),
			new Tile(3232, 3221, 0), new Tile(3232, 3226, 0), new Tile(3232, 3231, 0), new Tile(3233, 3236, 0), new Tile(3233, 3241, 0), new Tile(3232, 3246, 0),
			new Tile(3232, 3251, 0), new Tile(3231, 3256, 0), new Tile(3229, 3260, 0), new Tile(3233, 3261, 0), new Tile(3238, 3262, 0), new Tile(3241, 3264, 0),
			new Tile(3240, 3269, 0), new Tile(3240, 3274, 0), new Tile(3240, 3279, 0), new Tile(3239, 3284, 0), new Tile(3239, 3289, 0), new Tile(3239, 3294, 0),
			new Tile(3239, 3299, 0), new Tile(3237, 3304, 0), new Tile(3232, 3307, 0), new Tile(3227, 3311, 0), new Tile(3224, 3316, 0), new Tile(3221, 3321, 0),
			new Tile(3221, 3326, 0), new Tile(3216, 3330, 0), new Tile(3211, 3335, 0), new Tile(3206, 3340, 0), new Tile(3203, 3343, 0), new Tile(3198, 3344, 0),
			new Tile(3193, 3347, 0), new Tile(3188, 3348, 0), new Tile(3183, 3353, 0), new Tile(3180, 3358, 0), new Tile(3178, 3363, 0), new Tile(3180, 3367, 0)};
    
	public static final Tile[] CASTLE_TO_IRON = {new Tile(3219, 3218, 0), new Tile(3219, 3218, 0), new Tile(3224, 3218, 0), new Tile(3229, 3218, 0),
    		new Tile(3232, 3221, 0), new Tile(3232, 3226, 0), new Tile(3232, 3231, 0), new Tile(3233, 3236, 0), new Tile(3233, 3241, 0), new Tile(3232, 3246, 0),
    		new Tile(3232, 3251, 0), new Tile(3231, 3256, 0), new Tile(3229, 3260, 0), new Tile(3233, 3261, 0), new Tile(3238, 3262, 0), new Tile(3241, 3264, 0),
    		new Tile(3240, 3269, 0), new Tile(3240, 3274, 0), new Tile(3240, 3279, 0), new Tile(3239, 3284, 0), new Tile(3239, 3289, 0), new Tile(3239, 3294, 0),
    		new Tile(3239, 3299, 0), new Tile(3243, 3304, 0), new Tile(3248, 3309, 0), new Tile(3253, 3314, 0), new Tile(3258, 3319, 0), new Tile(3262, 3323, 0),
    		new Tile(3267, 3328, 0), new Tile(3267, 3333, 0), new Tile(3269, 3338, 0), new Tile(3269, 3343, 0), new Tile(3271, 3348, 0), new Tile(3271, 3353, 0),
    		new Tile(3271, 3358, 0), new Tile(3276, 3363, 0), new Tile(3277, 3368, 0), new Tile(3281, 3371, 0), new Tile(3284, 3367, 0), new Tile(3285, 3366, 0)};
	
    public static final Tile[] CASTLE_TO_BANK = {new Tile(3222, 3218, 0), new Tile(3218, 3218, 0), new Tile(3215, 3215, 0), new Tile(3215, 3211, 0),
			new Tile(3211, 3211, 0), new Tile(3207, 3210, 0), new Tile(3205, 3209, 1), new Tile(3205, 3209, 2), new Tile(3205, 3213, 2),
			new Tile(3206, 3217, 2), new Tile(3209, 3220, 2)};
	
    public static final Tile[] VEAST_BANK_TO_EAST_MINE = {new Tile(3253, 3420, 0), new Tile(3253, 3424, 0), new Tile(3254, 3427, 0), new Tile(3258, 3428, 0),
    		new Tile(3263, 3428, 0), new Tile(3268, 3428, 0), new Tile(3273, 3428, 0), new Tile(3277, 3424, 0), new Tile(3279, 3419, 0), new Tile(3280, 3416, 0),
    		new Tile(3282, 3413, 0), new Tile(3285, 3410, 0), new Tile(3288, 3408, 0), new Tile(3289, 3406, 0), new Tile(3289, 3403, 0), new Tile(3290, 3399, 0),
    		new Tile(3289, 3396, 0), new Tile(3290, 3393, 0), new Tile(3290, 3390, 0), new Tile(3290, 3386, 0), new Tile(3291, 3384, 0), new Tile(3291, 3380, 0),
    		new Tile(3291, 3378, 0), new Tile(3291, 3374, 0), new Tile(3289, 3372, 0), new Tile(3287, 3370, 0)
    };
	
	
	
}