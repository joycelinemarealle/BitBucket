rootProject.name = "Joyceline"
include("TDDLabsTest")
include("src:TDDLabsTest")
findProject(":src:TDDLabsTest")?.name = "TDDLabsTest"
