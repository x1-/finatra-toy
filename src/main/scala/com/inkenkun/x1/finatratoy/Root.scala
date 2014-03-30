package com.inkenkun.x1.finatratoy

import com.twitter.finatra.{Controller, UnsupportedMediaType}

class Root extends Controller {

  /**
   * root
   */
  get( "/" ) { request =>
    render.static( "/index.html" ).toFuture
  }

  /**
   * 404 NotFound.
   */
  notFound { request =>
    render.status( 404 ).plain( "not found yo" ).toFuture
  }

  /**
   * error
   */
  error { request =>
    request.error match {
      case Some(e:UnsupportedMediaType) =>
        render.status( 415 ).plain( "Unsupported Media Type!" ).toFuture
      case _ =>
        render.status( 500 ).plain( "Internal Server Error Occured!" ).toFuture
    }
  }
}
