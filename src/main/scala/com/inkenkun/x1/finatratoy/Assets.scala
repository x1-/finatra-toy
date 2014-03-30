package com.inkenkun.x1.finatratoy

import com.twitter.finatra.Controller

class Assets extends Controller {

  /**
   * readme
   */
  get( "/readme" ) { request =>
    render.static( "/readme.txt" ).toFuture
  }
}
