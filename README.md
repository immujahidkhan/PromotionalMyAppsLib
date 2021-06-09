# PromotionalMyAppsLib
# More Apps Lib

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
  
```
  	dependencies {
	        implementation 'com.github.immujahidkhan:PromotionalMyAppsLib:Tag'
	}
```

#Usage

```

<fragment
        android:id="@+id/promo"
        android:tag="URL HERE"
        android:name="com.justclack.promoapps.PromoAppAdsFragment"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
```
#Response must be like given below
```
[
  {
    "packageName": "com.zhiliaoapp.musically",
    "icon": "https://play-lh.googleusercontent.com/DSmTBqmTE3yYVPQJt6ENcj2hVI1GoNv4LYE6vT2xXdZMYeIsHEWky0YVyrdyI2EQIQ=s512-rw",
    "name": "TikTok XiaomiXiaomi"
  },
   {
    "packageName": "com.kwai.bulldog",
    "icon": "https://play-lh.googleusercontent.com/gY_ZMMqn6ArJyIH6Z5LdB0UW6s4QvPT1mekP2uWjk8CTe6ofk39JCd99dKtWmkByrA=s512-rw",
    "name": "SnackVideo"
  }
]
```
