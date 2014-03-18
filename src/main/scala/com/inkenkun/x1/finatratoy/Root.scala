package com.inkenkun.x1.finatratoy

import com.twitter.finatra.Controller

class Root extends Controller {
  get( "/" ) { request =>
    render.plain( "This is Root if this Application!" ).toFuture
  }
}
