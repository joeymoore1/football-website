package service

import javax.inject.Inject
import models.Result
import utils.Constants._

class ResultsService @Inject()() {

  def getResultById(id: Int): Result = {
    val filteredResults = fullResults.filter(_.index == id)
    filteredResults.head
  }
}
