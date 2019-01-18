package goldFarmer;

import org.powerbot.script.Area;
import org.powerbot.script.Tile;
import org.powerbot.script.rt4.ClientAccessor;
import org.powerbot.script.rt4.GameObject;
import org.powerbot.script.rt4.ClientContext;

public class cons extends ClientAccessor {
	
	public cons(ClientContext ctx) { super(ctx); }
	//--------------npcs--------------//
    //ids
	//goblins
    public static int GOBLIN_NPC_ID = 3308;

    //items
    public static int BRONZE_SWORD_ITEM_ID = 1277;
    public static int WOODEN_SHIELD_ITEM_ID = 1171;
    
    //varrock
    //vwest bank clerk
    
    //veast bank clerk
    
    //ge bank clerk
    //ge buyer dude
    
	//object ids
    public final static int TBANK_OBJECT_ID = 10083;
    public final static int FIRST_DOOR_ID = 9398;
	
    //--------------objects--------------//
    public final GameObject OBJECT = ctx.objects.select().id(TBANK_OBJECT_ID).nearest().poll();
    public final int[] OBJECT_BOUNDS = {116, 132, -176, 0, 8, 116};
	//OBJECT.bounds(bounds);
    
    // first room
	public final static String FIRST_STRING = "<col=0000ff>Getting started</col><br>Before you begin, have a read through";
    
	//--------------areas--------------//
	public final static Area TUTORIAL_ISLAND_AREA = new Area(new Tile(3056, 3147, 0), new Tile(3024, 3082, 0), new Tile(3055, 3031, 0), new Tile(3137, 3040, 0),
			new Tile(3147, 3061, 0), new Tile(3171, 3068, 0), new Tile(3168, 3132, 0), new Tile(3142, 3134, 0), new Tile(3133, 3144, 0), new Tile(3088, 3143, 0),
			new Tile(3079, 3149, 0));
	
    public final static Area LUMMY_GOBLIN_AREA = new Area(new Tile(3248, 3225, 0), new Tile(3250, 3223, 0), new Tile(3252, 3223, 0), new Tile(3255, 3221, 0),
    		new Tile(3257, 3219, 0), new Tile(3259, 3218, 0), new Tile(3262, 3214, 0), new Tile(3267, 3214, 0), new Tile(3267, 3223, 0), new Tile(3268, 3224, 0),
    		new Tile(3268, 3232, 0), new Tile(3267, 3233, 0), new Tile(3267, 3239, 0), new Tile(3266, 3240, 0), new Tile(3266, 3247, 0), new Tile(3265, 3248, 0),
    		new Tile(3265, 3255, 0), new Tile(3238, 3255, 0), new Tile(3238, 3250, 0), new Tile(3239, 3235, 0), new Tile(3247, 3228, 0), new Tile(3248, 3227, 0),
    		new Tile(3254, 3227, 0), new Tile(3255, 3225, 0));

    public final static Area LUMMY_SOUTH_MINING_AREA = new Area(new Tile(3222, 3153, 0), new Tile(3220, 3147, 0), new Tile(3225, 3142, 0), new Tile(3233, 3142, 0),
    		new Tile(3233, 3148, 0), new Tile(3228, 3153, 0));
    
    public final static Area LUMMY_SOUTHWEST_MINING_AREA = new Area(new Tile(3142, 3163, 0), new Tile(3132, 3146, 0), new Tile(3144, 3134, 0), new Tile(3158, 3140, 0));
    
    public final static Area LUMMY_CASTLE_AREA = new Area(new Tile(3201, 3234, 0), new Tile(3204, 3237, 0), new Tile(3213, 3237, 0), new Tile(3215, 3235, 0),
    		new Tile(3221, 3235, 0), new Tile(3227, 3229, 0), new Tile(3227, 3225, 1), new Tile(3228, 3226, 1), new Tile(3230, 3226, 1), new Tile(3231, 3225, 1),
    		new Tile(3231, 3222, 1), new Tile(3230, 3221, 1), new Tile(3230, 3217, 0), new Tile(3231, 3216, 0), new Tile(3231, 3213, 0), new Tile(3230, 3212, 0),
    		new Tile(3228, 3212, 0), new Tile(3227, 3213, 0), new Tile(3227, 3209, 0), new Tile(3221, 3203, 0), new Tile(3215, 3203, 0), new Tile(3213, 3201, 0),
    		new Tile(3204, 3201, 0), new Tile(3201, 3204, 0), new Tile(3201, 3217, 0), new Tile(3200, 3217, 0), new Tile(3199, 3218, 0), new Tile(3199, 3219, 0),
    		new Tile(3200, 3220, 0), new Tile(3201, 3220, 0));
    
    public final static Area LUMMY_CITY_AREA = new Area(new Tile(3165, 3285, 0), new Tile(3146, 3216, 0), new Tile(3148, 3214, 0), new Tile(3153, 3214, 0),
    		new Tile(3160, 3207, 0), new Tile(3186, 3207, 0), new Tile(3193, 3200, 0), new Tile(3193, 3199, 0), new Tile(3194, 3199, 0), new Tile(3195, 3198, 0),
    		new Tile(3199, 3198, 0), new Tile(3200, 3199, 0), new Tile(3224, 3199, 0), new Tile(3226, 3197, 0), new Tile(3230, 3197, 0), new Tile(3230, 3195, 0),
    		new Tile(3238, 3195, 0), new Tile(3238, 3191, 0), new Tile(3247, 3191, 0), new Tile(3247, 3190, 0), new Tile(3253, 3190, 0), new Tile(3257, 3195, 0),
    		new Tile(3267, 3204, 0), new Tile(3267, 3223, 0), new Tile(3268, 3224, 0), new Tile(3268, 3232, 0), new Tile(3267, 3233, 0), new Tile(3267, 3239, 0),
    		new Tile(3266, 3240, 0), new Tile(3266, 3247, 0), new Tile(3265, 3248, 0), new Tile(3265, 3255, 0), new Tile(3266, 3255, 0), new Tile(3266, 3297, 0),
    		new Tile(3264, 3299, 0), new Tile(3262, 3299, 0), new Tile(3261, 3300, 0), new Tile(3257, 3300, 0), new Tile(3256, 3299, 0), new Tile(3241, 3299, 0),
    		new Tile(3238, 3300, 0), new Tile(3236, 3302, 0), new Tile(3226, 3302, 0), new Tile(3187, 3306, 0), new Tile(3173, 3312, 0), new Tile(3171, 3304, 0),
    		new Tile(3167, 3299, 0));

    public final static Area LUMMY_SWAMP_AREA = new Area(new Tile(3129, 3205, 0), new Tile(3146, 3216, 0), new Tile(3148, 3214, 0), new Tile(3153, 3214, 0),
    		new Tile(3160, 3207, 0), new Tile(3186, 3207, 0), new Tile(3193, 3200, 0), new Tile(3193, 3199, 0), new Tile(3194, 3199, 0), new Tile(3195, 3198, 0),
    		new Tile(3199, 3198, 0), new Tile(3200, 3199, 0), new Tile(3224, 3199, 0), new Tile(3226, 3197, 0), new Tile(3230, 3197, 0), new Tile(3230, 3195, 0),
    		new Tile(3238, 3195, 0), new Tile(3238, 3191, 0), new Tile(3247, 3191, 0), new Tile(3247, 3190, 0), new Tile(3256, 3190, 0), new Tile(3248, 3152, 0),
    		new Tile(3245, 3139, 0), new Tile(3198, 3132, 0), new Tile(3136, 3136, 0));
    
    public final static Area VARROCK_EAST_MINING_AREA = new Area(new Tile(3276, 3373, 0), new Tile(3280, 3371, 0), new Tile(3281, 3370, 0), new Tile(3281, 3366, 0),
    		new Tile(3278, 3363, 0), new Tile(3278, 3360, 0), new Tile(3279, 3359, 0), new Tile(3283, 3359, 0), new Tile(3284, 3360, 0), new Tile(3287, 3360, 0), 
    		new Tile(3291, 3356, 0), new Tile(3293, 3356, 0), new Tile(3294, 3357, 0), new Tile(3295, 3357, 0), new Tile(3295, 3360, 0), new Tile(3293, 3362, 0),
    		new Tile(3293, 3363, 0), new Tile(3292, 3364, 0), new Tile(3292, 3365, 0), new Tile(3291, 3366, 0), new Tile(3291, 3371, 0), new Tile(3293, 3373, 0));
    
    public final static Area VARROCK_WEST_MINING_AREA = new Area(new Tile(3178, 3381, 0), new Tile(3175, 3374, 0), new Tile(3170, 3367, 0), new Tile(3171, 3361, 0),
    		new Tile(3181, 3362, 0), new Tile(3187, 3374, 0), new Tile(3185, 3380, 0));
    
    public final static Area VARROCK_WEST_BANK_AREA = new Area(new Tile(3180, 3448, 0), new Tile(3180, 3433, 0), new Tile(3191, 3433, 0), new Tile(3191, 3448, 0));
    
    public final static Area VARROCK_EAST_BANK_AREA = new Area(new Tile(3250, 3425, 0), new Tile(3250, 3416, 0), new Tile(3258, 3416, 0), new Tile(3258, 3425, 0));
    
    public final static Area GE_INNER_AREA = new Area(new Tile(3161, 3500, 0), new Tile(3169, 3500, 0), new Tile(3175, 3494, 0), new Tile(3175, 3486, 0),
    		new Tile(3169, 3480, 0), new Tile(3161, 3480, 0), new Tile(3155, 3485, 0), new Tile(3155, 3494, 0));
	
    public final static Area CASTLE1_AREA = new Area(new Tile(3204, 3231, 1), new Tile(3204, 3229, 1), new Tile(3205, 3228, 1), new Tile(3205, 3210, 1),
    		new Tile(3204, 3209, 1), new Tile(3204, 3207, 1), new Tile(3206, 3207, 1), new Tile(3207, 3208, 1), new Tile(3207, 3209, 1), new Tile(3215, 3209, 1),
    		new Tile(3217, 3211, 1), new Tile(3217, 3227, 1), new Tile(3215, 3229, 1), new Tile(3207, 3229, 1), new Tile(3207, 3230, 1), new Tile(3206, 3231, 1));
    
    public final static Area CASTLE2_AREA = new Area(new Tile(3204, 3231, 2), new Tile(3204, 3229, 2), new Tile(3205, 3228, 2), new Tile(3205, 3210, 2),
    		new Tile(3204, 3209, 2), new Tile(3204, 3207, 2), new Tile(3206, 3207, 2), new Tile(3207, 3208, 2), new Tile(3207, 3209, 2), new Tile(3215, 3209, 2),
    		new Tile(3217, 3211, 2), new Tile(3217, 3227, 2), new Tile(3215, 3229, 2), new Tile(3207, 3229, 2), new Tile(3207, 3230, 2), new Tile(3206, 3231, 2));

    public final static Area LUMMY_BANK_AREA = new Area(new Tile(3207, 3215, 2), new Tile(3211, 3215, 2), new Tile(3211, 3222, 2), new Tile(3210, 3223, 2),
    		new Tile(3208, 3223, 2), new Tile(3207, 3222, 2));

	public final static Area SPAWN_AREA = new Area(new Tile(3238, 3223, 0), new Tile(3234, 3218, 0), new Tile(3234, 3212, 0), new Tile(3239, 3213, 0),
			new Tile(3239, 3217, 0), new Tile(3243, 3217, 0));
    
	public final static Area DRAYNOR_CITY_AREA = new Area(new Tile(3071, 3250, 0), new Tile(3075, 3275, 0), new Tile(3096, 3290, 0), new Tile(3114, 3291, 0),
			new Tile(3116, 3293, 0), new Tile(3133, 3293, 0), new Tile(3137, 3222, 0), new Tile(3090, 3210, 0));
    
	public final static Area FALADOR_CITY_AREA = new Area(new Tile(2936, 3320, 0), new Tile(2940, 3320, 0), new Tile(2940, 3313, 0), new Tile(2942, 3311, 0),
			new Tile(2956, 3311, 0), new Tile(2957, 3310, 0), new Tile(2966, 3310, 0), new Tile(2967, 3309, 0), new Tile(2985, 3309, 0), new Tile(2992, 3316, 0),
			new Tile(2995, 3316, 0), new Tile(3002, 3323, 0), new Tile(3012, 3323, 0), new Tile(3016, 3327, 0), new Tile(3023, 3327, 0), new Tile(3025, 3329, 0),
			new Tile(3058, 3329, 0), new Tile(3059, 3328, 0), new Tile(3060, 3328, 0), new Tile(3061, 3329, 0), new Tile(3061, 3330, 0), new Tile(3060, 3331, 0),
			new Tile(3060, 3363, 0), new Tile(3066, 3369, 0), new Tile(3066, 3385, 0), new Tile(3061, 3390, 0), new Tile(3048, 3390, 0), new Tile(3047, 3389, 0),
			new Tile(3041, 3389, 0), new Tile(3040, 3390, 0), new Tile(3022, 3390, 0), new Tile(3020, 3392, 0), new Tile(3011, 3392, 0), new Tile(3008, 3395, 0),
			new Tile(3003, 3395, 0), new Tile(3002, 3394, 0), new Tile(2997, 3394, 0), new Tile(2996, 3393, 0), new Tile(2987, 3393, 0), new Tile(2985, 3395, 0),
			new Tile(2957, 3395, 0), new Tile(2956, 3394, 0), new Tile(2950, 3394, 0), new Tile(2949, 3395, 0), new Tile(2945, 3395, 0), new Tile(2943, 3393, 0),
			new Tile(2941, 3393, 0), new Tile(2936, 3388, 0));
	
	public final static Area EDGEVILLE_CITY_AREA = new Area(new Tile(3067, 3520, 0), new Tile(3067, 3515, 0), new Tile(3069, 3512, 0), new Tile(3067, 3464, 0),
			new Tile(3091, 3464, 0), new Tile(3092, 3463, 0), new Tile(3095, 3463, 0), new Tile(3096, 3464, 0), new Tile(3102, 3464, 0), new Tile(3102, 3473, 0),
			new Tile(3108, 3484, 0), new Tile(3111, 3490, 0), new Tile(3116, 3494, 0), new Tile(3122, 3498, 0), new Tile(3127, 3504, 0), new Tile(3128, 3508, 0),
			new Tile(3130, 3510, 0), new Tile(3131, 3513, 0), new Tile(3132, 3522, 0), new Tile(3063, 3522, 0), new Tile(3063, 3519, 0));
	
	public final static Area VARROCK_CITY_AREA = new Area(new Tile(3174, 3425, 0), new Tile(3174, 3399, 0), new Tile(3181, 3399, 0), new Tile(3182, 3398, 0),
			new Tile(3182, 3382, 0), new Tile(3203, 3382, 0), new Tile(3203, 3378, 0), new Tile(3207, 3378, 0), new Tile(3207, 3381, 0), new Tile(3239, 3381, 0),
			new Tile(3239, 3382, 0), new Tile(3242, 3382, 0), new Tile(3242, 3376, 0), new Tile(3251, 3375, 0), new Tile(3260, 3375, 0), new Tile(3265, 3376, 0),
			new Tile(3274, 3376, 0), new Tile(3274, 3377, 0), new Tile(3275, 3377, 0), new Tile(3276, 3376, 0), new Tile(3287, 3376, 0), new Tile(3290, 3379, 0),
			new Tile(3290, 3384, 0), new Tile(3289, 3385, 0), new Tile(3289, 3390, 0), new Tile(3288, 3391, 0), new Tile(3288, 3407, 0), new Tile(3287, 3408, 0),
			new Tile(3277, 3408, 0), new Tile(3274, 3411, 0), new Tile(3274, 3420, 0), new Tile(3277, 3420, 0), new Tile(3277, 3424, 0), new Tile(3274, 3424, 0),
			new Tile(3274, 3437, 0), new Tile(3271, 3437, 0), new Tile(3271, 3464, 0), new Tile(3263, 3472, 0), new Tile(3263, 3492, 0), new Tile(3262, 3493, 0),
			new Tile(3255, 3493, 0), new Tile(3252, 3496, 0), new Tile(3252, 3502, 0), new Tile(3235, 3502, 0), new Tile(3229, 3508, 0), new Tile(3200, 3508, 0), 
			new Tile(3196, 3504, 0), new Tile(3196, 3503, 0), new Tile(3190, 3497, 0), new Tile(3190, 3479, 0), new Tile(3187, 3476, 0), new Tile(3187, 3464, 0), 
			new Tile(3185, 3462, 0), new Tile(3185, 3458, 0), new Tile(3180, 3448, 0), new Tile(3180, 3433, 0));
	
	public final static Area GE_AREA = new Area(new Tile(3188, 3467, 0), new Tile(3142, 3467, 0), new Tile(3142, 3468, 0), new Tile(3138, 3472, 0),
			new Tile(3138, 3483, 0), new Tile(3141, 3486, 0), new Tile(3141, 3491, 0), new Tile(3138, 3494, 0), new Tile(3138, 3514, 0), new Tile(3142, 3518, 0),
			new Tile(3159, 3518, 0), new Tile(3162, 3515, 0), new Tile(3167, 3515, 0), new Tile(3170, 3518, 0), new Tile(3190, 3518, 0), new Tile(3201, 3507, 0),
			new Tile(3197, 3503, 0), new Tile(3197, 3502, 0), new Tile(3191, 3496, 0), new Tile(3191, 3478, 0), new Tile(3188, 3475, 0));
	
	public final static Area ALKHARID_CITY_AREA = new Area(new Tile(3262, 3134, 0), new Tile(3251, 3176, 0), new Tile(3261, 3198, 0), new Tile(3267, 3204, 0),
			new Tile(3267, 3223, 0), new Tile(3268, 3224, 0), new Tile(3268, 3232, 0), new Tile(3267, 3233, 0), new Tile(3267, 3239, 0), new Tile(3266, 3240, 0),
			new Tile(3266, 3247, 0), new Tile(3265, 3248, 0), new Tile(3265, 3255, 0), new Tile(3266, 3255, 0), new Tile(3266, 3297, 0), new Tile(3265, 3298, 0),
			new Tile(3267, 3298, 0), new Tile(3267, 3322, 0), new Tile(3271, 3326, 0), new Tile(3271, 3329, 0), new Tile(3272, 3330, 0), new Tile(3300, 3330, 0),
			new Tile(3301, 3331, 0), new Tile(3304, 3331, 0), new Tile(3305, 3330, 0), new Tile(3307, 3330, 0), new Tile(3308, 3329, 0), new Tile(3316, 3329, 0),
			new Tile(3317, 3330, 0), new Tile(3319, 3330, 0), new Tile(3320, 3331, 0), new Tile(3322, 3331, 0), new Tile(3323, 3330, 0), new Tile(3334, 3330, 0),
			new Tile(3335, 3329, 0), new Tile(3336, 3329, 0), new Tile(3337, 3328, 0), new Tile(3338, 3328, 0), new Tile(3340, 3330, 0), new Tile(3346, 3330, 0),
			new Tile(3347, 3329, 0), new Tile(3350, 3329, 0), new Tile(3351, 3328, 0), new Tile(3356, 3328, 0), new Tile(3357, 3329, 0), new Tile(3360, 3329, 0),
			new Tile(3361, 3330, 0), new Tile(3370, 3330, 0), new Tile(3371, 3329, 0), new Tile(3375, 3329, 0), new Tile(3376, 3330, 0), new Tile(3397, 3330, 0),
			new Tile(3401, 3322, 0), new Tile(3417, 3315, 0), new Tile(3416, 3298, 0), new Tile(3413, 3289, 0), new Tile(3415, 3279, 0), new Tile(3422, 3268, 0),
			new Tile(3423, 3208, 0), new Tile(3431, 3183, 0), new Tile(3415, 3177, 0), new Tile(3412, 3165, 0), new Tile(3410, 3161, 0), new Tile(3403, 3161, 0),
			new Tile(3399, 3164, 0), new Tile(3394, 3164, 0), new Tile(3393, 3153, 0), new Tile(3394, 3147, 0), new Tile(3383, 3131, 0), new Tile(3382, 3125, 0),
			new Tile(3377, 3126, 0), new Tile(3375, 3129, 0), new Tile(3365, 3129, 0), new Tile(3363, 3128, 0), new Tile(3359, 3127, 0), new Tile(3356, 3125, 0),
			new Tile(3353, 3124, 0), new Tile(3352, 3125, 0), new Tile(3354, 3128, 0), new Tile(3361, 3133, 0), new Tile(3364, 3136, 0), new Tile(3363, 3138, 0),
			new Tile(3351, 3148, 0), new Tile(3355, 3154, 0), new Tile(3351, 3158, 0), new Tile(3336, 3159, 0), new Tile(3335, 3151, 0), new Tile(3333, 3144, 0),
			new Tile(3330, 3137, 0), new Tile(3326, 3135, 0), new Tile(3274, 3135, 0));
	
	//--------------walker--------------//
    public static final Tile[] BANK_TO_GOBLINS = {new Tile(3208, 3220, 2), new Tile(3206, 3224, 2), new Tile(3206, 3228, 2), new Tile(3205, 3228, 1),
    		new Tile(3205, 3228, 0), new Tile(3209, 3228, 0), new Tile(3213, 3228, 0), new Tile(3215, 3224, 0), new Tile(3215, 3220, 0), new Tile(3219, 3219, 0),
    		new Tile(3223, 3219, 0), new Tile(3227, 3219, 0), new Tile(3231, 3219, 0), new Tile(3235, 3220, 0), new Tile(3238, 3223, 0), new Tile(3242, 3225, 0),
    		new Tile(3246, 3225, 0), new Tile(3250, 3225, 0), new Tile(3254, 3226, 0), new Tile(3258, 3228, 0), new Tile(3254, 3230, 0), new Tile(3253, 3234, 0)};
    
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