package com.inkenkun.x1.finatratoy

import com.twitter.finatra.FinatraServer

object App extends FinatraServer {

  register( new Root )
  register( new Assets )

}