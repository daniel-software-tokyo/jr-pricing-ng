Imports Fhi.Fw.Domain

Namespace Model.Specification
    ''' <summary>
    ''' 出発日
    ''' </summary>
    ''' <remarks></remarks>
    Public Class DepartureDate : Inherits PrimitiveValueObject(Of DateTime?)

        Public Sub New(value As Date?)
            MyBase.New(value)
        End Sub

    End Class
End Namespace