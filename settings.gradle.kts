rootProject.name = "Joyceline"
include("TDDLabsTest")
include("src:TDDLabsTest")
findProject(":src:TDDLabsTest")?.name = "TDDLabsTest"
include("src:main:TDDLabs")
findProject(":src:main:TDDLabs")?.name = "TDDLabs"
include("JSONModule")
include("SpringBoot")
